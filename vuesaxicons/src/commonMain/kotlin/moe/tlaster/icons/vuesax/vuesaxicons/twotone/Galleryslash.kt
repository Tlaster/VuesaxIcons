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

public val TwotoneGroup.Galleryslash: ImageVector
    get() {
        if (_galleryslash != null) {
            return _galleryslash!!
        }
        _galleryslash = Builder(name = "Galleryslash", defaultWidth = 24.0.dp, defaultHeight =
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
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
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
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.9709f, 7.9902f)
                curveTo(21.9909f, 8.3102f, 22.0009f, 8.6502f, 22.0009f, 9.0002f)
                verticalLineTo(15.0002f)
                curveTo(22.0009f, 20.0002f, 20.0009f, 22.0002f, 15.0009f, 22.0002f)
                horizontalLineTo(9.0009f)
                curveTo(8.2609f, 22.0002f, 7.5809f, 21.9602f, 6.9609f, 21.8602f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.4297f, 16.4502f)
                curveTo(11.7297f, 16.7502f, 12.2197f, 16.7502f, 12.5197f, 16.4502f)
                lineTo(17.5497f, 11.4102f)
                curveTo(18.3297f, 10.6302f, 19.5897f, 10.6302f, 20.3697f, 11.4102f)
                lineTo(21.9997f, 13.0502f)
            }
        }
        .build()
        return _galleryslash!!
    }

private var _galleryslash: ImageVector? = null
