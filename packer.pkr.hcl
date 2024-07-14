packer {
  required_plugins {
    amazon = {
      version = ">= 1.0.0"
      source  = "github.com/hashicorp/amazon"
    }
  }
}

variable "aws_region" {
  default = "us-east-1"
}

variable "ami_name" {
  description = "Name of the AMI to be created"
  default     = "packer-template"
}

source "amazon-ebs" "example" {
  region          = var.aws_region
  source_ami      = "ami-04a81a99f5ec58529"
  instance_type   = "t2.micro"
  ssh_username    = "ubuntu"
  ami_name        = var.ami_name
}

build {
  sources = ["source.amazon-ebs.example"]

  provisioner "shell" {
    inline = [
      "sudo apt-get update",
      "sudo apt-get install -y nginx"
    ]
  }
}
