package moe.tlaster.icons.vuesax.vuesaxicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.TwotoneGroup

public val TwotoneGroup.House: ImageVector
    get() {
        if (_house != null) {
            return _house!!
        }
        _house = Builder(name = "House", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.0f, 22.0f)
                horizontalLineTo(22.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.9502f, 22.0003f)
                lineTo(3.0002f, 9.9702f)
                curveTo(3.0002f, 9.3602f, 3.2902f, 8.7803f, 3.7702f, 8.4003f)
                lineTo(10.7702f, 2.9503f)
                curveTo(11.4902f, 2.3903f, 12.5002f, 2.3903f, 13.2302f, 2.9503f)
                lineTo(20.2302f, 8.3903f)
                curveTo(20.7202f, 8.7703f, 21.0002f, 9.3502f, 21.0002f, 9.9702f)
                verticalLineTo(22.0003f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Butt, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 17.0f)
                horizontalLineTo(11.0f)
                curveTo(10.17f, 17.0f, 9.5f, 17.67f, 9.5f, 18.5f)
                verticalLineTo(22.0f)
                horizontalLineTo(14.5f)
                verticalLineTo(18.5f)
                curveTo(14.5f, 17.67f, 13.83f, 17.0f, 13.0f, 17.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Butt, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.5f, 13.75f)
                horizontalLineTo(7.5f)
                curveTo(6.95f, 13.75f, 6.5f, 13.3f, 6.5f, 12.75f)
                verticalLineTo(11.25f)
                curveTo(6.5f, 10.7f, 6.95f, 10.25f, 7.5f, 10.25f)
                horizontalLineTo(9.5f)
                curveTo(10.05f, 10.25f, 10.5f, 10.7f, 10.5f, 11.25f)
                verticalLineTo(12.75f)
                curveTo(10.5f, 13.3f, 10.05f, 13.75f, 9.5f, 13.75f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Butt, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.5f, 13.75f)
                horizontalLineTo(14.5f)
                curveTo(13.95f, 13.75f, 13.5f, 13.3f, 13.5f, 12.75f)
                verticalLineTo(11.25f)
                curveTo(13.5f, 10.7f, 13.95f, 10.25f, 14.5f, 10.25f)
                horizontalLineTo(16.5f)
                curveTo(17.05f, 10.25f, 17.5f, 10.7f, 17.5f, 11.25f)
                verticalLineTo(12.75f)
                curveTo(17.5f, 13.3f, 17.05f, 13.75f, 16.5f, 13.75f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.0003f, 7.0f)
                lineTo(18.9703f, 4.0f)
                horizontalLineTo(14.5703f)
            }
        }
        .build()
        return _house!!
    }

private var _house: ImageVector? = null
