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

public val BulkGroup.Link: ImageVector
    get() {
        if (_link != null) {
            return _link!!
        }
        _link = Builder(name = "Link", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.5002f, 14.75f)
                horizontalLineTo(10.0002f)
                curveTo(9.5902f, 14.75f, 9.2502f, 14.41f, 9.2502f, 14.0f)
                curveTo(9.2502f, 13.59f, 9.5902f, 13.25f, 10.0002f, 13.25f)
                horizontalLineTo(12.5002f)
                curveTo(15.1202f, 13.25f, 17.2502f, 11.12f, 17.2502f, 8.5f)
                curveTo(17.2502f, 5.88f, 15.1202f, 3.75f, 12.5002f, 3.75f)
                horizontalLineTo(7.5002f)
                curveTo(4.8802f, 3.75f, 2.7502f, 5.88f, 2.7502f, 8.5f)
                curveTo(2.7502f, 9.6f, 3.1402f, 10.67f, 3.8402f, 11.52f)
                curveTo(4.1002f, 11.84f, 4.0602f, 12.31f, 3.7402f, 12.58f)
                curveTo(3.4202f, 12.84f, 2.9502f, 12.8f, 2.6802f, 12.48f)
                curveTo(1.7502f, 11.36f, 1.2402f, 9.95f, 1.2402f, 8.5f)
                curveTo(1.2402f, 5.05f, 4.0402f, 2.25f, 7.4902f, 2.25f)
                horizontalLineTo(12.4902f)
                curveTo(15.9402f, 2.25f, 18.7402f, 5.05f, 18.7402f, 8.5f)
                curveTo(18.7402f, 11.95f, 15.9502f, 14.75f, 12.5002f, 14.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.5f, 21.75f)
                horizontalLineTo(11.5f)
                curveTo(8.05f, 21.75f, 5.25f, 18.95f, 5.25f, 15.5f)
                curveTo(5.25f, 12.05f, 8.05f, 9.25f, 11.5f, 9.25f)
                horizontalLineTo(14.0f)
                curveTo(14.41f, 9.25f, 14.75f, 9.59f, 14.75f, 10.0f)
                curveTo(14.75f, 10.41f, 14.41f, 10.75f, 14.0f, 10.75f)
                horizontalLineTo(11.5f)
                curveTo(8.88f, 10.75f, 6.75f, 12.88f, 6.75f, 15.5f)
                curveTo(6.75f, 18.12f, 8.88f, 20.25f, 11.5f, 20.25f)
                horizontalLineTo(16.5f)
                curveTo(19.12f, 20.25f, 21.25f, 18.12f, 21.25f, 15.5f)
                curveTo(21.25f, 14.4f, 20.86f, 13.33f, 20.16f, 12.48f)
                curveTo(19.9f, 12.16f, 19.94f, 11.69f, 20.26f, 11.42f)
                curveTo(20.58f, 11.15f, 21.05f, 11.2f, 21.32f, 11.52f)
                curveTo(22.25f, 12.64f, 22.76f, 14.05f, 22.76f, 15.5f)
                curveTo(22.75f, 18.95f, 19.95f, 21.75f, 16.5f, 21.75f)
                close()
            }
        }
        .build()
        return _link!!
    }

private var _link: ImageVector? = null
