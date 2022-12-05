resource "aws_key_pair" "marcelo_terraform_key" {
  key_name   = "terraform-aws"
  public_key = file("terraform-aws.pub")
}