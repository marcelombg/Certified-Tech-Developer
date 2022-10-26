provider "aws" {
    region = "us-east-2"
    access_key = "AKIA2DOXMKGDINKQJDKL"
    secret_key = "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"
}

resource "aws_instance" "servidor_teste_1" {
    ami = "ami-097a2df4ac947655f"
    instance_type = "t2.micro"
    key_name = "aws-key-marcelo-1"
    tags = {
      Name = "servidor_teste_1"
    }
}

resource "aws_key_pair" "terraform-marcelo-aws" {
    key_name = "aws-key-marcelo-1"  
    public_key = file("terraform-marcelo-aws.pub")
}