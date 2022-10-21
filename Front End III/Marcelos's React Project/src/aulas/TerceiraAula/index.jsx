import './style.scss'
import gif1 from './../../assets/images/giphy1.gif'

export function TerceiraAula () {

    const components = [
        {
            name: 'Component Card 1',
            description: 'teste 1',
            image: 'https://media3.giphy.com/media/yUI3a7RwLhOFy/giphy.gif?cid=ecf05e476b2kpac8fyplah4qavhk6gxig31s30vfbaqnv20a&rid=giphy.gif&ct=g'
        },
        {
            name: 'Component Card 2',
            description: 'teste 2',
            image: 'https://media1.giphy.com/media/l2JeiuwmhZlkrVOkU/giphy.gif?cid=ecf05e476b2kpac8fyplah4qavhk6gxig31s30vfbaqnv20a&rid=giphy.gif&ct=g'
        },
        {
            name: 'Component Card 3',
            description: 'teste 3',
            image: 'https://media0.giphy.com/media/zbyE0sDeW4z3W/giphy.gif?cid=ecf05e476b2kpac8fyplah4qavhk6gxig31s30vfbaqnv20a&rid=giphy.gif&ct=g'
        },
        {
            name: 'Component Card 4',
            description: 'teste 4',
            image: 'https://media2.giphy.com/media/PjOHE76srQkzWbRN7Y/giphy.gif?cid=ecf05e476b2kpac8fyplah4qavhk6gxig31s30vfbaqnv20a&rid=giphy.gif&ct=g'
        }
    ]

    return (
        <main>
            <img className='gif' src={gif1}/>
            <h1>Lista de componentes encontrados em um sistema</h1>
            <ul>
                {components.map(component =>
                    <li>
                        <img src={component.image}/>
                        <h1>{component.name}</h1> 
                        <p>{component.description}</p>
                    </li>
                )}
            </ul>

        </main>
    )
}