provider "aws" {
    region = var.regiao
    access_key = ""
    secret_key = ""
}

#MESA AULA 4
# ssh -i pasta/nome-da-chave usuario@IP-ou-DNS
# ssh -i .ssh/terraform-aws ubuntu@3.141.85.40
# terraform init - baixar os modulos do terraform baseado nos seus arquivos
# terraform plan - mostrar o plano a ser feito
# terraform apply - vai aplicar o plano ou seja vai contruir tudo se não tiver erro
# terraform destroy - acabou, já era boa sorte
# terraform output - mostra as saidas do output
# terraform show - mostra como está a sua infra
# ssh -i pasta/nome-da-chave usuario@IP-ou-DNS
# ssh -i .ssh/terraform-aws ubuntu@3.141.85.40

#MESA AULA 5
# Configure o aws com a informações da AWS
# digitalhouse@digitalhouse:~$ aws configure
# ACESS_KEY:
# SECRET_KEY:
# REGION:
# OUTPUT: json

# Crie o projeto do Terraform e inicie
# digitalhouse@digitalhouse:~$ terraform init

# Vamos planificar e depois aplicar as configurações na aws:
# digitalhouse@digitalhouse:~$ terraform plan
# digitalhouse@digitalhouse:~$ terraform apply

# Verifique na aws a instância criada e depois:
# digitalhouse@digitalhouse:~$ terraform destroy