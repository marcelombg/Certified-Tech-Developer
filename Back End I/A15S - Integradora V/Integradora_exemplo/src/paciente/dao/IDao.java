package paciente.dao;

import paciente.model.Endereco;

public interface IDao <T>{

    public T salvar(T t);

}
