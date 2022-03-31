const handleDelete = id => fetch('/hockey/' + id, {method: 'DELETE'})
.then(res => window.location.href = res.url)