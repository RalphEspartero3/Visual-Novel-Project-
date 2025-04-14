function handleStatusChange(name, status) {
    switch (status) {
        case "Promote":
            console.log(`${name} has been promoted to officer`);
            break;
        case "Remove":
            console.log(`${name} has been removed`);
            break;
        default:
            console.log(`Invalid status`);
    }
}

