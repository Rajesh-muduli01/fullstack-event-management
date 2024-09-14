const eventId = new URLSearchParams(window.location.search).get('id');

// Get the event details from the backend API
axios.get(`/events/${eventId}`)
  .then(response => {
    const event = response.data;
    document.getElementById('event-name').textContent = event.name;
    document.getElementById('event-description').textContent = event.description;
    document.getElementById('event-date').textContent = event.date;
    document.getElementById('event-time').textContent = event.time;
    document.getElementById('event-location').textContent = event.location;
  })
  .catch(error => {
    console.error(error);
  });

// Handle RSVP button click
document.getElementById('rsvp-button').addEventListener('click', () => {
  // Navigate to the RSVP page
  window.location.href = `rsvp.html?event_id=${eventId}`;
});