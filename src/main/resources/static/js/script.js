axios.get('/events')
  .then(response => {
    const events = response.data;
    const eventsList = document.getElementById('events-list');
    events.forEach(event => {
      const eventListItem = document.createElement('li');
      eventListItem.textContent = event.name;
      eventListItem.addEventListener('click', () => {
        // Navigate to the event details page
        window.location.href = `event.html?id=${event.id}`;
      });
      eventsList.appendChild(eventListItem);
    });
  })
  .catch(error => {
    console.error(error);
  });