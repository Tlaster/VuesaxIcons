package moe.tlaster.icons.vuesax.vuesaxicons.twotone

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
import moe.tlaster.icons.vuesax.vuesaxicons.TwotoneGroup

public val TwotoneGroup.Useredit: ImageVector
    get() {
        if (_useredit != null) {
            return _useredit!!
        }
        _useredit = Builder(name = "Useredit", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 12.0f)
                curveTo(14.7614f, 12.0f, 17.0f, 9.7614f, 17.0f, 7.0f)
                curveTo(17.0f, 4.2386f, 14.7614f, 2.0f, 12.0f, 2.0f)
                curveTo(9.2386f, 2.0f, 7.0f, 4.2386f, 7.0f, 7.0f)
                curveTo(7.0f, 9.7614f, 9.2386f, 12.0f, 12.0f, 12.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.211f, 15.74f)
                lineTo(15.671f, 19.2801f)
                curveTo(15.531f, 19.4201f, 15.401f, 19.68f, 15.371f, 19.87f)
                lineTo(15.181f, 21.22f)
                curveTo(15.111f, 21.71f, 15.451f, 22.05f, 15.941f, 21.98f)
                lineTo(17.291f, 21.79f)
                curveTo(17.481f, 21.76f, 17.751f, 21.63f, 17.881f, 21.49f)
                lineTo(21.421f, 17.95f)
                curveTo(22.031f, 17.34f, 22.321f, 16.63f, 21.421f, 15.73f)
                curveTo(20.531f, 14.84f, 19.821f, 15.13f, 19.211f, 15.74f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.6992f, 16.25f)
                curveTo(18.9992f, 17.33f, 19.8392f, 18.17f, 20.9192f, 18.47f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.4102f, 22.0f)
                curveTo(3.4102f, 18.13f, 7.2602f, 15.0f, 12.0002f, 15.0f)
                curveTo(13.0402f, 15.0f, 14.0402f, 15.15f, 14.9702f, 15.43f)
            }
        }
        .build()
        return _useredit!!
    }

private var _useredit: ImageVector? = null
