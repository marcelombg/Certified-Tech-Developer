import './style_card.scss'

export function Card(props) {

  return (

    <div className="card-component" style={{backgroundColor:props.cardCadastrado.codigo}}>
      <h1>{props.cardCadastrado.cor}</h1>
      <span>{props.cardCadastrado.codigo}</span>
    </div>
    
  )
}