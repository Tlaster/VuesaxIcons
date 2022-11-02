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

public val TwotoneGroup.Documentfavorite: ImageVector
    get() {
        if (_documentfavorite != null) {
            return _documentfavorite!!
        }
        _documentfavorite = Builder(name = "Documentfavorite", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(22.0f, 10.0f)
                verticalLineTo(15.0f)
                curveTo(22.0f, 20.0f, 20.0f, 22.0f, 15.0f, 22.0f)
                horizontalLineTo(9.0f)
                curveTo(4.0f, 22.0f, 2.0f, 20.0f, 2.0f, 15.0f)
                verticalLineTo(9.0f)
                curveTo(2.0f, 4.0f, 4.0f, 2.0f, 9.0f, 2.0f)
                horizontalLineTo(14.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(22.0f, 10.0f)
                horizontalLineTo(18.0f)
                curveTo(15.0f, 10.0f, 14.0f, 9.0f, 14.0f, 6.0f)
                verticalLineTo(2.0f)
                lineTo(22.0f, 10.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.6198f, 15.7299f)
                curveTo(6.2898f, 14.6999f, 6.6798f, 13.4299f, 7.7498f, 13.0799f)
                curveTo(8.3198f, 12.8999f, 9.0198f, 13.0499f, 9.4098f, 13.5999f)
                curveTo(9.7798f, 13.0299f, 10.5098f, 12.8999f, 11.0698f, 13.0799f)
                curveTo(12.1498f, 13.4299f, 12.5298f, 14.6999f, 12.2098f, 15.7299f)
                curveTo(11.6998f, 17.3599f, 9.9098f, 18.2099f, 9.4098f, 18.2099f)
                curveTo(8.9198f, 18.1999f, 7.1498f, 17.3699f, 6.6198f, 15.7299f)
                close()
            }
        }
        .build()
        return _documentfavorite!!
    }

private var _documentfavorite: ImageVector? = null
