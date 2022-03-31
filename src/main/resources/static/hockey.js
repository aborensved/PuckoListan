const handleDelete = id => fetch('/hockey/' + id, {method: 'DELETE'})
.then(() => window.location.href = res.url)