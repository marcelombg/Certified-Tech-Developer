import './style.scss'
import youtubeimage from "./../../assets/images/youtube_home.png"

export function QuartaAula () {

    const componentsFinded = [
        {
            id: 1,
            title: 'Vídeo',
            image: youtubeimage,
            text: "Lorem ipsum dolor sit amet."
        },
        {
            id: 2,
            title: 'Input',
            image: youtubeimage,
            text: "Lorem ipsum dolor sit amet."
        },
        {
            id: 3,
            title: 'Vídeo 2',
            image: youtubeimage,
            text: "Lorem ipsum dolor sit amet."
        },
        {
            title: 'Input 2',
            image: youtubeimage,
            text: "Lorem ipsum dolor sit amet."
        },
        {
            id: 4,
            title: 'Vídeo 3',
            image: youtubeimage,
            text: "Lorem ipsum dolor sit amet."
        },
        {
            id: 5,
            title: 'Input 3',
            image: youtubeimage,
            text: "Lorem ipsum dolor sit amet."
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
                    <p>{item.title}</p>
                </li>
                )}
            </ul>
        </div>
    )
}