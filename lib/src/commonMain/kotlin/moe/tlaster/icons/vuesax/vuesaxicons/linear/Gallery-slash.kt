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

public val LinearGroup.`Gallery-slash`: ImageVector
    get() {
        if (`_gallery-slash` != null) {
            return `_gallery-slash`!!
        }
        `_gallery-slash` = Builder(name = "Gallery-slash", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.37f, 20.1f)
                curveTo(2.43f, 18.97f, 2.0f, 17.31f, 2.0f, 15.0f)
                verticalLineTo(9.0f)
                curveTo(2.0f, 4.0f, 4.0f, 2.0f, 9.0f, 2.0f)
                horizontalLineTo(15.0f)
                curveTo(17.19f, 2.0f, 18.8f, 2.38f, 19.92f, 3.23f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(21.97f, 7.99f)
                curveTo(21.99f, 8.31f, 22.0f, 8.65f, 22.0f, 9.0f)
                verticalLineTo(15.0f)
                curveTo(22.0f, 20.0f, 20.0f, 22.0f, 15.0f, 22.0f)
                horizontalLineTo(9.0f)
                curveTo(8.26f, 22.0f, 7.58f, 21.96f, 6.96f, 21.86f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.0f, 10.0f)
                curveTo(9.1046f, 10.0f, 10.0f, 9.1046f, 10.0f, 8.0f)
                curveTo(10.0f, 6.8954f, 9.1046f, 6.0f, 8.0f, 6.0f)
                curveTo(6.8954f, 6.0f, 6.0f, 6.8954f, 6.0f, 8.0f)
                curveTo(6.0f, 9.1046f, 6.8954f, 10.0f, 8.0f, 10.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(22.0f, 2.0f)
                lineTo(2.0f, 22.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.4301f, 16.45f)
                curveTo(11.7301f, 16.75f, 12.2201f, 16.75f, 12.5201f, 16.45f)
                lineTo(17.5501f, 11.41f)
                curveTo(18.3301f, 10.63f, 19.5901f, 10.63f, 20.3701f, 11.41f)
                lineTo(22.0001f, 13.05f)
            }
        }
        .build()
        return `_gallery-slash`!!
    }

private var `_gallery-slash`: ImageVector? = null
