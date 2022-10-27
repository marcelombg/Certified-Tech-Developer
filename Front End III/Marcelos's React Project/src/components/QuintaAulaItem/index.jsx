export function QuintaAulaItem(props) {

    console.log(props)

    return (
        <li>
            <img src={props.component.image}/>
            <h1 >{props.component.title}</h1>
            <p>{props.component.text}</p>
        </li>
    )
}