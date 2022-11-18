import './style.scss'

export function DecimaQuintaAulaItem(props) {

    return(
        <div className="decima-quinta-aula-item">
            <h1>Nome do Endereço</h1>
            <address>Rua, Bairro - Cidade(Estado)</address>
            <small>Cep</small>
            <button onClick={() => props.onDeleteLocation(props.data)}>Deletar</button>
        </div>
    )

}