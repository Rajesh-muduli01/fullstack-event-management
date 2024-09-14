const eventId = new URLSearchParams(window.location.search).get('event_id');

// Handle form submission
document.getElementById('rsvp-form').addEventListener('submit', (event) => {
  event.preventDefault();
  const response = document.getElementById('response').value;
  axios.post('/rsvps', {
    event_id: eventId,
    user_id: 'current_user_id',
    response: response
  })
  .then(response => {
    console.log('RSVP sent successfully');
    // Navigate to the attendees page
    window.location.href = `attendees.html?event_id=${eventId}`;
  })
  .catch(error => {
    console.error(error);
  });
});