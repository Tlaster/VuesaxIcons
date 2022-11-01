package moe.tlaster.icons.vuesax.vuesaxicons.linear

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
import moe.tlaster.icons.vuesax.vuesaxicons.LinearGroup

public val LinearGroup.Trello: ImageVector
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
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.5499f, 17.72f)
                horizontalLineTo(7.0999f)
                curveTo(6.4299f, 17.72f, 5.8799f, 17.17f, 5.8799f, 16.5f)
                verticalLineTo(7.51f)
                curveTo(5.8799f, 6.84f, 6.4299f, 6.29f, 7.0999f, 6.29f)
                horizontalLineTo(9.5499f)
                curveTo(10.2199f, 6.29f, 10.7699f, 6.84f, 10.7699f, 7.51f)
                verticalLineTo(16.49f)
                curveTo(10.7699f, 17.17f, 10.2199f, 17.72f, 9.5499f, 17.72f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.1397f, 13.63f)
                horizontalLineTo(14.1997f)
                curveTo(13.6597f, 13.63f, 13.2197f, 13.19f, 13.2197f, 12.65f)
                verticalLineTo(7.27f)
                curveTo(13.2197f, 6.73f, 13.6597f, 6.29f, 14.1997f, 6.29f)
                horizontalLineTo(17.1397f)
                curveTo(17.6797f, 6.29f, 18.1197f, 6.73f, 18.1197f, 7.27f)
                verticalLineTo(12.66f)
                curveTo(18.1297f, 13.19f, 17.6797f, 13.63f, 17.1397f, 13.63f)
                close()
            }
        }
        .build()
        return _trello!!
    }

private var _trello: ImageVector? = null
