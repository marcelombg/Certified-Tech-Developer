provider "aws" {
    region = "us-east-2"
    access_key = "AKIAV4YTWNKPJFGO72OG"
    secret_key = "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"
}

resource "aws_instance" "servidor-marcelo-1" {
    ami = "ami-097a2df4ac947655f"
    instance_type = "t2.micro"
    key_name = "key-marcelo-2"  
}

resource "aws_key_pair" "terraform-marcelo-aws" {
    key_name = "key-marcelo-2"  
    public_key = file("terraform-marcelo-aws.pub")
}