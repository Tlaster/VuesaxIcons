package moe.tlaster.icons.vuesax.vuesaxicons.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.LinearGroup

public val LinearGroup.`Ontology-(ont)`: ImageVector
    get() {
        if (`_ontology-(ont)` != null) {
            return `_ontology-(ont)`!!
        }
        `_ontology-(ont)` = Builder(name = "Ontology-(ont)", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF17191C)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.9f, 19.7001f)
                curveTo(16.2f, 21.2001f, 13.9f, 22.1001f, 11.4f, 22.0001f)
                curveTo(6.2f, 21.9001f, 2.1999f, 17.4001f, 2.1999f, 12.2001f)
                verticalLineTo(5.2001f)
                curveTo(2.1999f, 4.8001f, 2.6999f, 4.5001f, 3.1f, 4.8001f)
                lineTo(17.9f, 19.7001f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF17191C)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.2f, 4.3f)
                curveTo(7.9f, 2.8f, 10.2f, 1.9f, 12.6f, 2.0f)
                curveTo(17.7f, 2.1f, 21.7f, 6.5f, 21.7f, 11.7f)
                verticalLineTo(18.7f)
                curveTo(21.7f, 19.1f, 21.2f, 19.4f, 20.8f, 19.1f)
                lineTo(6.2f, 4.3f)
                close()
            }
        }
        .build()
        return `_ontology-(ont)`!!
    }

private var `_ontology-(ont)`: ImageVector? = null
