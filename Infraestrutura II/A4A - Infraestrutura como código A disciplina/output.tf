output "ec2_instances_public" {
  value = aws_instance.ec2_instances.*.public_ip
}

output "ec2_instances_private" {
  value = aws_instance.ec2_instances.*.private_ip
}