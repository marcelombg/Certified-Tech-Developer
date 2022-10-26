resource "aws_key_pair" "ec2_instances" {
    key_name = "terraform-${var.usuario}-aws"  
    public_key = file("terraform-marcelo-aws.pub")
    tags = {
        Name = "${var.usuario}-ec2-${count.index}"
    }
}