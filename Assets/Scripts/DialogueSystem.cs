using System.Collections;
using UnityEngine;
using TMPro;

public class DialogueSystem : MonoBehaviour
{
    public GameObject dialogueBox;
    public TMP_Text dialogueText;
    public string[] dialogueLines;
    private int currentLine = 0;
    private bool isDialogueActive = false;

    void Update()
    {
        if (isDialogueActive && Input.GetKeyDown(KeyCode.Space))
        {
            NextLine();
        }
    }

    public void StartDialogue()
    {
        dialogueBox.SetActive(true);
        currentLine = 0;
        dialogueText.text = dialogueLines[currentLine];
        isDialogueActive = true;
    }

    void NextLine()
    {
        currentLine++;
        if (currentLine < dialogueLines.Length)
        {
            dialogueText.text = dialogueLines[currentLine];
        }
        else
        {
            EndDialogue();
        }
    }

    void EndDialogue()
    {
        dialogueBox.SetActive(false);
        isDialogueActive = false;
    }
}
