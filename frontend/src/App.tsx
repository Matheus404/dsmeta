import Header from "./components/Heder"
import NotificationButton from "./components/NotificationButton"
import SalesCard from "./components/SalesCard"

function App() {
  return (
    <main>
      <section id="sales">
        <div className="dsmeta-container">
          <div>
            <Header />
            <SalesCard />
          </div>
        </div>
      </section>
    </main >

  )
}

export default App
