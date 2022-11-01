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

public val TwotoneGroup.Trello: ImageVector
    get() {
        if (_trello != null) {
            return _trello!!
        }
        _trello = Builder(name = "Trello", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.0f, 22.0f)
                horizontalLineTo(9.0f)
                curveTo(4.0f, 22.0f, 2.0f, 20.0f, 2.0f, 15.0f)
                verticalLineTo(9.0f)
                curveTo(2.0f, 4.0f, 4.0f, 2.0f, 9.0f, 2.0f)
                horizontalLineTo(15.0f)
                curveTo(20.0f, 2.0f, 22.0f, 4.0f, 22.0f, 9.0f)
                verticalLineTo(15.0f)
                curveTo(22.0f, 20.0f, 20.0f, 22.0f, 15.0f, 22.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.5499f, 17.7198f)
                horizontalLineTo(7.0999f)
                curveTo(6.4299f, 17.7198f, 5.8799f, 17.1698f, 5.8799f, 16.4998f)
                verticalLineTo(7.5198f)
                curveTo(5.8799f, 6.8498f, 6.4299f, 6.2998f, 7.0999f, 6.2998f)
                horizontalLineTo(9.5499f)
                curveTo(10.2199f, 6.2998f, 10.7699f, 6.8498f, 10.7699f, 7.5198f)
                verticalLineTo(16.4998f)
                curveTo(10.7699f, 17.1698f, 10.2199f, 17.7198f, 9.5499f, 17.7198f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.1398f, 13.6298f)
                horizontalLineTo(14.1998f)
                curveTo(13.6598f, 13.6298f, 13.2197f, 13.1898f, 13.2197f, 12.6498f)
                verticalLineTo(7.2598f)
                curveTo(13.2197f, 6.7198f, 13.6598f, 6.2798f, 14.1998f, 6.2798f)
                horizontalLineTo(17.1398f)
                curveTo(17.6798f, 6.2798f, 18.1198f, 6.7198f, 18.1198f, 7.2598f)
                verticalLineTo(12.6498f)
                curveTo(18.1198f, 13.1898f, 17.6798f, 13.6298f, 17.1398f, 13.6298f)
                close()
            }
        }
        .build()
        return _trello!!
    }

private var _trello: ImageVector? = null
