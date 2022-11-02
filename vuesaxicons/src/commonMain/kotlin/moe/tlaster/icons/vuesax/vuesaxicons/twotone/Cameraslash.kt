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

public val TwotoneGroup.Cameraslash: ImageVector
    get() {
        if (_cameraslash != null) {
            return _cameraslash!!
        }
        _cameraslash = Builder(name = "Cameraslash", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 10.0f)
                horizontalLineTo(9.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.7598f, 21.9998f)
                horizontalLineTo(17.2398f)
                curveTo(19.9998f, 21.9998f, 21.0998f, 20.3098f, 21.2298f, 18.2498f)
                lineTo(21.7498f, 9.9898f)
                curveTo(21.8098f, 9.0598f, 21.5198f, 8.1898f, 21.0098f, 7.5098f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.0002f, 6.0f)
                curveTo(17.3902f, 6.0f, 16.8302f, 5.65f, 16.5502f, 5.11f)
                lineTo(15.8302f, 3.66f)
                curveTo(15.3702f, 2.75f, 14.1702f, 2.0f, 13.1502f, 2.0f)
                horizontalLineTo(10.8602f)
                curveTo(9.8302f, 2.0f, 8.6302f, 2.75f, 8.1702f, 3.66f)
                lineTo(7.4502f, 5.11f)
                curveTo(7.1702f, 5.65f, 6.6102f, 6.0f, 6.0002f, 6.0f)
                curveTo(3.8302f, 6.0f, 2.1102f, 7.83f, 2.2502f, 9.99f)
                lineTo(2.7702f, 18.25f)
                curveTo(2.8202f, 19.07f, 3.0302f, 19.84f, 3.4402f, 20.46f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 17.31f)
                curveTo(10.55f, 17.74f, 11.25f, 18.0f, 12.0f, 18.0f)
                curveTo(13.79f, 18.0f, 15.25f, 16.54f, 15.25f, 14.75f)
                curveTo(15.25f, 14.11f, 15.07f, 13.52f, 14.75f, 13.02f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(22.0f, 2.0f)
                lineTo(2.0f, 22.0f)
            }
        }
        .build()
        return _cameraslash!!
    }

private var _cameraslash: ImageVector? = null
