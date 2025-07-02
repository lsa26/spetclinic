const API_ENDPOINT = 'https://api.example.com/data';

async function fetchData(token) {
  if (!token) {
    throw new Error('Missing required parameter: token');
  }
  const response = await fetch(API_ENDPOINT, {
    method: 'GET',
    headers: {
      'Authorization': `Bearer ${token}`
    }
  });
  // ... rest of the code
}