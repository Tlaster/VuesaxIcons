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

public val BulkGroup.Login: ImageVector
    get() {
        if (_login != null) {
            return _login!!
        }
        _login = Builder(name = "Login", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.7604f, 2.0f)
                curveTo(10.2804f, 2.0f, 9.9004f, 2.38f, 9.9004f, 2.86f)
                verticalLineTo(21.15f)
                curveTo(9.9004f, 21.62f, 10.2804f, 22.01f, 10.7604f, 22.01f)
                curveTo(16.6504f, 22.01f, 20.7604f, 17.9f, 20.7604f, 12.01f)
                curveTo(20.7604f, 6.12f, 16.6404f, 2.0f, 10.7604f, 2.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.9002f, 11.5399f)
                lineTo(13.0602f, 8.6899f)
                curveTo(12.7702f, 8.3999f, 12.2902f, 8.3999f, 12.0002f, 8.6899f)
                curveTo(11.7102f, 8.9799f, 11.7102f, 9.4599f, 12.0002f, 9.7499f)
                lineTo(13.5602f, 11.3099f)
                horizontalLineTo(3.9902f)
                curveTo(3.5802f, 11.3099f, 3.2402f, 11.6499f, 3.2402f, 12.0599f)
                curveTo(3.2402f, 12.4699f, 3.5802f, 12.8099f, 3.9902f, 12.8099f)
                horizontalLineTo(13.5602f)
                lineTo(12.0002f, 14.3799f)
                curveTo(11.7102f, 14.6699f, 11.7102f, 15.1499f, 12.0002f, 15.4399f)
                curveTo(12.1502f, 15.5899f, 12.3402f, 15.6599f, 12.5302f, 15.6599f)
                curveTo(12.7202f, 15.6599f, 12.9102f, 15.5899f, 13.0602f, 15.4399f)
                lineTo(15.9002f, 12.5899f)
                curveTo(16.2002f, 12.2999f, 16.2002f, 11.8299f, 15.9002f, 11.5399f)
                close()
            }
        }
        .build()
        return _login!!
    }

private var _login: ImageVector? = null
