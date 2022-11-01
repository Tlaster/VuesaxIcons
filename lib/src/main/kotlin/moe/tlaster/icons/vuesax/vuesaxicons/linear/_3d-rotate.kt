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

public val LinearGroup.`_3d-rotate`: ImageVector
    get() {
        if (`__3d-rotate` != null) {
            return `__3d-rotate`!!
        }
        `__3d-rotate` = Builder(name = "_3d-rotate", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.7f, 9.26f)
                lineTo(12.0f, 12.33f)
                lineTo(17.26f, 9.28f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 17.7701f)
                verticalLineTo(12.3201f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.76f, 6.29f)
                lineTo(7.56f, 8.07f)
                curveTo(6.84f, 8.47f, 6.24f, 9.48f, 6.24f, 10.31f)
                verticalLineTo(13.7f)
                curveTo(6.24f, 14.53f, 6.83f, 15.54f, 7.56f, 15.94f)
                lineTo(10.76f, 17.72f)
                curveTo(11.44f, 18.1f, 12.56f, 18.1f, 13.25f, 17.72f)
                lineTo(16.45f, 15.94f)
                curveTo(17.17f, 15.54f, 17.77f, 14.53f, 17.77f, 13.7f)
                verticalLineTo(10.3f)
                curveTo(17.77f, 9.47f, 17.18f, 8.46f, 16.45f, 8.06f)
                lineTo(13.25f, 6.28f)
                curveTo(12.56f, 5.9f, 11.44f, 5.9f, 10.76f, 6.29f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(22.0f, 15.0f)
                curveTo(22.0f, 18.87f, 18.87f, 22.0f, 15.0f, 22.0f)
                lineTo(16.05f, 20.25f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.0f, 9.0f)
                curveTo(2.0f, 5.13f, 5.13f, 2.0f, 9.0f, 2.0f)
                lineTo(7.95f, 3.75f)
            }
        }
        .build()
        return `__3d-rotate`!!
    }

private var `__3d-rotate`: ImageVector? = null
