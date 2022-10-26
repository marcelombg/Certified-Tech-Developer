resource "aws_instance" "ec2_instances" {
    count = 2
    ami = var.ami
    instance_type = var.instancia
    key_name = "terraform-marcelo-aws"
    tags = {
        Name = "${var.usuario}-ec2-${count.index}"
    }

    user_data = <<-EOF
        #!/bin/bash
        sudo apt update
        sudo apt install apache2 -y
    EOF 
}