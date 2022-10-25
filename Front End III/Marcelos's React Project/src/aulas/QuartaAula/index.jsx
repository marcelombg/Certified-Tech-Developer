import './style.scss'
import youtubeimage from "./../../assets/images/youtube_home.png"

export function QuartaAula () {

    const componentsFinded = [
        {
            title: 'Vídeo',
            image: youtubeimage,
            text: "Lorem ipsum dolor sit amet."
        },
        {
            title: 'Input',
            image: youtubeimage,
            text: "Lorem ipsum dolor sit amet."
        },
        {
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
            title: 'Vídeo 3',
            image: youtubeimage,
            text: "Lorem ipsum dolor sit amet."
        },
        {
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
                <li>
                    <img src={item.image} alt="" />
                    <h1 >{item.title}</h1>
                    <p>{item.title}</p>
                </li>
                )}
            </ul>
        
        </div>
    )
}