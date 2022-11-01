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

public val LinearGroup.`Card-pos`: ImageVector
    get() {
        if (`_card-pos` != null) {
            return `_card-pos`!!
        }
        `_card-pos` = Builder(name = "Card-pos", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.9297f, 15.8792f)
                lineTo(15.8797f, 3.9292f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.1013f, 18.2791f)
                lineTo(12.3013f, 17.0791f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.793f, 15.5887f)
                lineTo(16.183f, 13.1987f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.6013f, 10.239f)
                lineTo(10.2413f, 3.599f)
                curveTo(12.3613f, 1.479f, 13.4213f, 1.469f, 15.5213f, 3.569f)
                lineTo(20.4313f, 8.479f)
                curveTo(22.5313f, 10.579f, 22.5213f, 11.639f, 20.4013f, 13.759f)
                lineTo(13.7613f, 20.399f)
                curveTo(11.6413f, 22.519f, 10.5813f, 22.529f, 8.4813f, 20.429f)
                lineTo(3.5713f, 15.519f)
                curveTo(1.4713f, 13.419f, 1.4713f, 12.369f, 3.6013f, 10.239f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.0f, 21.9985f)
                horizontalLineTo(22.0f)
            }
        }
        .build()
        return `_card-pos`!!
    }

private var `_card-pos`: ImageVector? = null
