var rocketMarker;

function setRocketMarker(marker) {
  rocketMarker = marker;
}

function setRocketLocation(lat, long) {
  rocketMarker.setPosition(new google.maps.LatLng(lat, long));
}