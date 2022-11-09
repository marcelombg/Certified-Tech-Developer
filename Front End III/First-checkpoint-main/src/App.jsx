import { useState } from 'react'
import { Card } from './Card'
import './style_app.scss'

function App() {

  const [nomeCor, setNomeCor] = useState('')
  const [listaCor, setListaCor] = useState('')
  const [formularioErro, setFormularioErro] = useState(false)
  const [allCards, setAllCards] = useState([])

  function cadastrarCor(event) {

    event.preventDefault();

    const novoCardCadastrado = {
      cor: nomeCor,
      codigo: listaCor,
      
    }

    if (listaCor == '' || nomeCor.length < 3) {

      setFormularioErro(true)

    } else {

      setFormularioErro(false)
      setNomeCor('')
      setListaCor('')
      setAllCards([novoCardCadastrado, ...allCards])

    }
  }

  return (

    <main className="checkpoint-component">


      <div className="form">

        <div className="adicionar-nova-cor">
          <h1>ADICIONAR NOVA COR</h1>
        </div>

        <form className={formularioErro ? 'form-error' : ''} onSubmit={event => cadastrarCor(event)}>
          <label htmlFor="nomeCor">NOME</label>
          <input type="text" value={nomeCor.trim()} onChange={event => setNomeCor(event.target.value)} />

          <label htmlFor="listaCor">COR</label>
          <input id="listaCor" type="color" list="presetColors" value={listaCor} onChange={event => setListaCor(event.target.value)} />

          <datalist id="presetColors">
            <option value="presetColors"></option>
            <option value="presetColors"></option>
            <option value="presetColors"></option>
          </datalist>

          <button type='submit'>ADICIONAR</button>

        </form>

        {
          formularioErro ? (
            <span className='error'>Por favor, verifique os dados inseridos no formulário</span>
          ) : null
        }

      </div>

      <div className="cores-favoritas">

        <h1>CORES FAVORITAS</h1>

        <section className='cards'>
          {
            allCards.map(
              card => {
                return (
                  <Card
                    cardCadastrado={card}
                  />
                )
              }
            )
          }
        </section>

      </div>

    </main>
  )
}

export default App