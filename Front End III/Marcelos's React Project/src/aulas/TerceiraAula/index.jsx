import './style.scss'
import gif1 from './../../assets/images/giphy5.gif'
import { useParams } from 'react-router-dom'

export function TerceiraAula () {
    
    const { id } = useParams
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
        },
        {
            name: 'Component Card 5',
            description: 'teste 5',
            image: 'https://media1.giphy.com/media/zfNAMCrhSQzte/giphy.gif?cid=ecf05e4729rnsaaqxhb2f5j3ntolqu9zog6bdykp12vo2di4&rid=giphy.gif&ct=g'
        },
        {
            name: 'Component Card 6',
            description: 'teste 6',
            image: 'https://media2.giphy.com/media/U2nN0ridM4lXy/giphy.gif?cid=ecf05e4729rnsaaqxhb2f5j3ntolqu9zog6bdykp12vo2di4&rid=giphy.gif&ct=g'
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