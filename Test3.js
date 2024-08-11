import React from "react";

const ObjectArrayComparison = ({ oldArray, newArray }) => {
  // Function to compare objects and return a diff object
  const compareObjects = (oldObj, newObj) => {
    const diff = {};
    for (const key in newObj) {
      if (oldObj[key] !== newObj[key]) {
        diff[key] = true;
      }
    }
    return diff;
  };

  // Get all unique keys from both arrays
  const allKeys = Array.from(
    new Set([
      ...oldArray.flatMap(Object.keys),
      ...newArray.flatMap(Object.keys),
    ])
  );

  return (
    <table border="1" style={{ width: "100%", borderCollapse: "collapse" }}>
      <thead>
        <tr>
          {allKeys.map((key) => (
            <th key={key}>{key}</th>
          ))}
          {allKeys.map((key) => (
            <th key={`${key}_new`}>{key}</th>
          ))}
        </tr>
      </thead>
      <tbody>
        {oldArray.map((oldObj, index) => {
          const newObj = newArray[index] || {};
          const diff = compareObjects(oldObj, newObj);
          const rowStyle = {
            backgroundColor: index % 2 === 0 ? "green" : "blue",
            color: "white",
            cursor: "pointer",
          };
          const hoverStyle = {
            backgroundColor: "lightorange",
          };

          return (
            <tr
              key={index}
              style={rowStyle}
              onMouseEnter={(e) =>
                (e.currentTarget.style.backgroundColor =
                  hoverStyle.backgroundColor)
              }
              onMouseLeave={(e) =>
                (e.currentTarget.style.backgroundColor =
                  rowStyle.backgroundColor)
              }
            >
              {allKeys.map((key) => (
                <td key={key} style={{ color: diff[key] ? "orange" : "white" }}>
                  {oldObj[key] !== undefined ? oldObj[key] : "N/A"}
                </td>
              ))}
              {allKeys.map((key) => (
                <td
                  key={`${key}_new`}
                  style={{ color: diff[key] ? "orange" : "white" }}
                >
                  {newObj[key] !== undefined ? newObj[key] : "N/A"}
                </td>
              ))}
            </tr>
          );
        })}
      </tbody>
    </table>
  );
};

// Example usage
const oldArray = [
  { name: "Alice", age: 25, city: "New York" },
  { name: "Bob", age: 30, city: "Chicago" },
];

const newArray = [
  { name: "Alice", age: 30, city: "New York" },
  { name: "Bob", age: 30, city: "San Francisco" },
];

function App() {
  return (
    <div className="App">
      <ObjectArrayComparison oldArray={oldArray} newArray={newArray} />
    </div>
  );
}

export default App;
