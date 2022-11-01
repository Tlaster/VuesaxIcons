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

public val LinearGroup.`Box-search`: ImageVector
    get() {
        if (`_box-search` != null) {
            return `_box-search`!!
        }
        `_box-search` = Builder(name = "Box-search", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.17f, 7.4399f)
                lineTo(12.0f, 12.5499f)
                lineTo(20.77f, 7.4699f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 21.6099f)
                verticalLineTo(12.5399f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(21.61f, 12.83f)
                verticalLineTo(9.17f)
                curveTo(21.61f, 7.79f, 20.62f, 6.11f, 19.41f, 5.44f)
                lineTo(14.07f, 2.48f)
                curveTo(12.93f, 1.84f, 11.07f, 1.84f, 9.93f, 2.48f)
                lineTo(4.59f, 5.44f)
                curveTo(3.38f, 6.11f, 2.39f, 7.79f, 2.39f, 9.17f)
                verticalLineTo(14.83f)
                curveTo(2.39f, 16.21f, 3.38f, 17.89f, 4.59f, 18.56f)
                lineTo(9.93f, 21.52f)
                curveTo(10.5f, 21.84f, 11.25f, 22.0f, 12.0f, 22.0f)
                curveTo(12.75f, 22.0f, 13.5f, 21.84f, 14.07f, 21.52f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.2f, 21.4f)
                curveTo(20.9673f, 21.4f, 22.4f, 19.9673f, 22.4f, 18.2f)
                curveTo(22.4f, 16.4327f, 20.9673f, 15.0f, 19.2f, 15.0f)
                curveTo(17.4327f, 15.0f, 16.0f, 16.4327f, 16.0f, 18.2f)
                curveTo(16.0f, 19.9673f, 17.4327f, 21.4f, 19.2f, 21.4f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(23.0f, 22.0f)
                lineTo(22.0f, 21.0f)
            }
        }
        .build()
        return `_box-search`!!
    }

private var `_box-search`: ImageVector? = null
