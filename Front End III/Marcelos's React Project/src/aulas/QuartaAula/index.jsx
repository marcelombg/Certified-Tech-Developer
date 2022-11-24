import './style.scss'
import youtubeimage from "./../../assets/images/youtube_home.png"
import { useParams } from 'react-router-dom'

export function QuartaAula () {
    
    const { id } = useParams
    const componentsFinded = [
        {
            id: 1,
            title: 'Vídeo 1',
            image: youtubeimage,
            text: "Lorem ipsum dolor, sit amet consectetur adipisicing elit."
        },
        {
            id: 2,
            title: 'Vídeo 2',
            image: youtubeimage,
            text: "Lorem ipsum dolor, sit amet consectetur adipisicing elit."
        },
        {
            id: 3,
            title: 'Vídeo 3',
            image: youtubeimage,
            text: "Lorem ipsum dolor, sit amet consectetur adipisicing elit."
        },
        {
            id: 4,
            title: 'Vídeo 4',
            image: youtubeimage,
            text: "Lorem ipsum dolor, sit amet consectetur adipisicing elit."
        },
        {
            id: 5,
            title: 'Vídeo 5',
            image: youtubeimage,
            text: "Lorem ipsum dolor, sit amet consectetur adipisicing elit."
        },
        {
            id: 6,
            title: 'Vídeo 6',
            image: youtubeimage,
            text: "Lorem ipsum dolor, sit amet consectetur adipisicing elit."
        }
    ]

    return (
        <div className='quarta-aula-component'>
            <h1 className='main-title'>Componentes identificados</h1>
            <ul className='components-finded'>
                {componentsFinded.map(item =>
                <li key={item.id}>
                    <img src={item.image} alt="" />
                    <h1 >{item.title}</h1>
                    <p>{item.text}</p>
                </li>
                )}
            </ul>
        </div>
    )
}