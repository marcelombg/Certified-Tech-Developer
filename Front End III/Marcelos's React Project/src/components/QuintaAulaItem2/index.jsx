export function QuintaAulaItem2(props) {

    console.log(props)

    return (
        <a href={props.component2.link}>
            <img src={props.component2.image2} />
        </a>
    )
}