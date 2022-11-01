import './style.scss'

export function GamesSectionVerticalItem(props) {

    console.log(props.type)

    return (
        <div className={`games-section-vertical-item-component ${props.type === 'vertical' ? 'item-verical' : 'item-card'}`}>
            <img className='game-picture' src={props.game.picture} />
            <div className="infos">
                <h1 className='name'>{props.game.name}</h1>
                <span className='plataforms'>{props.game.plataforms[0]}</span>
                <span className='categories'>
                    {
                        props.game.categories.map(
                            category => {
                                return (
                                    <a href="">{category}</a>
                                )
                            }
                        )
                    }
                </span>
            </div>
            <span>{props.game.price}</span>
        </div>
    )

}