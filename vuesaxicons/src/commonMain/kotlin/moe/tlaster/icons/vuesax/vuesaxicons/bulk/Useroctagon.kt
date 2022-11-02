package moe.tlaster.icons.vuesax.vuesaxicons.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.BulkGroup

public val BulkGroup.Useroctagon: ImageVector
    get() {
        if (_useroctagon != null) {
            return _useroctagon!!
        }
        _useroctagon = Builder(name = "Useroctagon", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(21.0802f, 8.58f)
                verticalLineTo(15.42f)
                curveTo(21.0802f, 16.54f, 20.4802f, 17.58f, 19.5102f, 18.15f)
                lineTo(13.5702f, 21.58f)
                curveTo(12.6002f, 22.14f, 11.4002f, 22.14f, 10.4202f, 21.58f)
                lineTo(4.4802f, 18.15f)
                curveTo(3.5102f, 17.59f, 2.9102f, 16.55f, 2.9102f, 15.42f)
                verticalLineTo(8.58f)
                curveTo(2.9102f, 7.46f, 3.5102f, 6.42f, 4.4802f, 5.85f)
                lineTo(10.4202f, 2.42f)
                curveTo(11.3902f, 1.86f, 12.5902f, 1.86f, 13.5702f, 2.42f)
                lineTo(19.5102f, 5.85f)
                curveTo(20.4802f, 6.42f, 21.0802f, 7.45f, 21.0802f, 8.58f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.9999f, 12.0001f)
                curveTo(13.2867f, 12.0001f, 14.3299f, 10.9569f, 14.3299f, 9.67f)
                curveTo(14.3299f, 8.3832f, 13.2867f, 7.3401f, 11.9999f, 7.3401f)
                curveTo(10.7131f, 7.3401f, 9.6699f, 8.3832f, 9.6699f, 9.67f)
                curveTo(9.6699f, 10.9569f, 10.7131f, 12.0001f, 11.9999f, 12.0001f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.6792f, 16.6601f)
                curveTo(15.4892f, 16.6601f, 15.9592f, 15.7601f, 15.5092f, 15.0901f)
                curveTo(14.8292f, 14.0801f, 13.5092f, 13.4001f, 11.9992f, 13.4001f)
                curveTo(10.4892f, 13.4001f, 9.1692f, 14.0801f, 8.4892f, 15.0901f)
                curveTo(8.0392f, 15.7601f, 8.5092f, 16.6601f, 9.3192f, 16.6601f)
                horizontalLineTo(14.6792f)
                close()
            }
        }
        .build()
        return _useroctagon!!
    }

private var _useroctagon: ImageVector? = null
