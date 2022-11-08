import './style_card.scss'

export function Card(props) {

  return (

    <div className="checkpoint-card-produto-component" style={{background:props.color}}>
      <h1>{props.productData.name}</h1>
      <span>{props.productData.codigo}</span>
    </div>
    
  )
}