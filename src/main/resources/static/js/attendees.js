const eventId = new URLSearchParams(window.location.search).get('event_id');

// Get the list of attendees from the backend API
axios.get(`/attendees/${eventId}`)
  .then(response => {
    const attendees = response.data;
    const attendeesList = document.getElementById('attendees-list');
    attendees.forEach(attendee => {
      const attendeeListItem = document.createElement('li');
      attendeeListItem.textContent = attendee.name;
      attendeesList.appendChild(attendeeListItem);
    });
  })
  .catch(error => {
    console.error(error);
  });