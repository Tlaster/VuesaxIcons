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

public val LinearGroup.`Box-tick`: ImageVector
    get() {
        if (`_box-tick` != null) {
            return `_box-tick`!!
        }
        `_box-tick` = Builder(name = "Box-tick", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(23.0f, 17.91f)
                curveTo(23.02f, 18.66f, 22.82f, 19.37f, 22.46f, 19.98f)
                curveTo(22.26f, 20.34f, 21.99f, 20.6701f, 21.69f, 20.9401f)
                curveTo(21.0f, 21.5801f, 20.09f, 21.9701f, 19.08f, 22.0001f)
                curveTo(17.62f, 22.0301f, 16.33f, 21.2801f, 15.62f, 20.1301f)
                curveTo(15.24f, 19.5401f, 15.01f, 18.8301f, 15.0f, 18.0801f)
                curveTo(14.97f, 16.8201f, 15.53f, 15.6801f, 16.43f, 14.9301f)
                curveTo(17.11f, 14.3701f, 17.97f, 14.0201f, 18.91f, 14.0001f)
                curveTo(21.12f, 13.9501f, 22.95f, 15.7f, 23.0f, 17.91f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.44f, 18.03f)
                lineTo(18.45f, 18.99f)
                lineTo(20.54f, 16.97f)
            }
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
                moveTo(21.61f, 9.17f)
                verticalLineTo(14.83f)
                curveTo(21.61f, 14.88f, 21.61f, 14.92f, 21.6f, 14.97f)
                curveTo(20.9f, 14.36f, 20.0f, 14.0f, 19.0f, 14.0f)
                curveTo(18.06f, 14.0f, 17.19f, 14.33f, 16.5f, 14.88f)
                curveTo(15.58f, 15.61f, 15.0f, 16.74f, 15.0f, 18.0f)
                curveTo(15.0f, 18.75f, 15.21f, 19.46f, 15.58f, 20.06f)
                curveTo(15.67f, 20.22f, 15.78f, 20.37f, 15.9f, 20.51f)
                lineTo(14.07f, 21.52f)
                curveTo(12.93f, 22.16f, 11.07f, 22.16f, 9.93f, 21.52f)
                lineTo(4.59f, 18.56f)
                curveTo(3.38f, 17.89f, 2.39f, 16.21f, 2.39f, 14.83f)
                verticalLineTo(9.17f)
                curveTo(2.39f, 7.79f, 3.38f, 6.11f, 4.59f, 5.44f)
                lineTo(9.93f, 2.48f)
                curveTo(11.07f, 1.84f, 12.93f, 1.84f, 14.07f, 2.48f)
                lineTo(19.41f, 5.44f)
                curveTo(20.62f, 6.11f, 21.61f, 7.79f, 21.61f, 9.17f)
                close()
            }
        }
        .build()
        return `_box-tick`!!
    }

private var `_box-tick`: ImageVector? = null
