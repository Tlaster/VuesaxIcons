package moe.tlaster.icons.vuesax.vuesaxicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.TwotoneGroup

public val TwotoneGroup.Liketag: ImageVector
    get() {
        if (_liketag != null) {
            return _liketag!!
        }
        _liketag = Builder(name = "Liketag", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.6504f, 13.7999f)
                lineTo(11.2604f, 15.0499f)
                curveTo(11.4704f, 15.2599f, 11.9404f, 15.3598f, 12.2504f, 15.3598f)
                horizontalLineTo(14.2304f)
                curveTo(14.8504f, 15.3598f, 15.5304f, 14.8899f, 15.6904f, 14.2699f)
                lineTo(16.9404f, 10.4798f)
                curveTo(17.2004f, 9.7498f, 16.7304f, 9.1298f, 15.9504f, 9.1298f)
                horizontalLineTo(13.8704f)
                curveTo(13.5604f, 9.1298f, 13.3004f, 8.8698f, 13.3504f, 8.5098f)
                lineTo(13.6104f, 6.8498f)
                curveTo(13.7104f, 6.3798f, 13.4004f, 5.8598f, 12.9304f, 5.7098f)
                curveTo(12.5104f, 5.5498f, 11.9904f, 5.7598f, 11.7904f, 6.0698f)
                lineTo(9.6604f, 9.2398f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 13.7998f)
                verticalLineTo(8.7097f)
                curveTo(7.0f, 7.9797f, 7.31f, 7.7197f, 8.04f, 7.7197f)
                horizontalLineTo(8.56f)
                curveTo(9.29f, 7.7197f, 9.6f, 7.9797f, 9.6f, 8.7097f)
                verticalLineTo(13.7998f)
                curveTo(9.6f, 14.5298f, 9.29f, 14.7898f, 8.56f, 14.7898f)
                horizontalLineTo(8.04f)
                curveTo(7.31f, 14.7898f, 7.0f, 14.5298f, 7.0f, 13.7998f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.0f, 18.8597f)
                horizontalLineTo(17.24f)
                curveTo(16.44f, 18.8597f, 15.68f, 19.1697f, 15.12f, 19.7297f)
                lineTo(13.41f, 21.4198f)
                curveTo(12.63f, 22.1898f, 11.36f, 22.1898f, 10.58f, 21.4198f)
                lineTo(8.87f, 19.7297f)
                curveTo(8.31f, 19.1697f, 7.54f, 18.8597f, 6.75f, 18.8597f)
                horizontalLineTo(6.0f)
                curveTo(4.34f, 18.8597f, 3.0f, 17.5298f, 3.0f, 15.8898f)
                verticalLineTo(4.9797f)
                curveTo(3.0f, 3.3397f, 4.34f, 2.0098f, 6.0f, 2.0098f)
                horizontalLineTo(18.0f)
                curveTo(19.66f, 2.0098f, 21.0f, 3.3397f, 21.0f, 4.9797f)
                verticalLineTo(15.8898f)
                curveTo(21.0f, 17.5198f, 19.66f, 18.8597f, 18.0f, 18.8597f)
                close()
            }
        }
        .build()
        return _liketag!!
    }

private var _liketag: ImageVector? = null
