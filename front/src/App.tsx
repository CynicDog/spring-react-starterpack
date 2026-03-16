import { useEffect, useState } from 'react';

interface GreetResponse {
  data: string;
}

export default function App() {
  const [message, setMessage] = useState<string>("Waiting for data...");

  useEffect(() => {
    fetch('http://localhost:8081/api/relay')
        .then(res => res.json())
        .then((json: GreetResponse) => setMessage(json.data))
        .catch(err => setMessage("Error: " + err.message));
  }, []);

  return (
      <div style={{ padding: '2rem', fontFamily: 'sans-serif' }}>
        <h1>System Status</h1>
        <p>Database Message: <strong>{message}</strong></p>
      </div>
  );
}