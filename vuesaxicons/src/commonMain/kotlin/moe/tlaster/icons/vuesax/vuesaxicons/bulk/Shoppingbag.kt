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

public val BulkGroup.Shoppingbag: ImageVector
    get() {
        if (_shoppingbag != null) {
            return _shoppingbag!!
        }
        _shoppingbag = Builder(name = "Shoppingbag", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.4908f, 22.0f)
                horizontalLineTo(7.5108f)
                curveTo(4.0008f, 22.0f, 3.2408f, 19.99f, 3.5308f, 17.53f)
                lineTo(4.4308f, 10.03f)
                curveTo(4.6608f, 8.09f, 5.0008f, 6.5f, 8.4008f, 6.5f)
                horizontalLineTo(15.6008f)
                curveTo(19.0008f, 6.5f, 19.3408f, 8.09f, 19.5708f, 10.03f)
                lineTo(20.3208f, 16.28f)
                lineTo(20.4708f, 17.53f)
                curveTo(20.4808f, 17.61f, 20.4908f, 17.69f, 20.5008f, 17.77f)
                curveTo(20.7108f, 20.12f, 19.8908f, 22.0f, 16.4908f, 22.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 8.75f)
                curveTo(15.59f, 8.75f, 15.25f, 8.41f, 15.25f, 8.0f)
                verticalLineTo(4.5f)
                curveTo(15.25f, 3.42f, 14.58f, 2.75f, 13.5f, 2.75f)
                horizontalLineTo(10.5f)
                curveTo(9.42f, 2.75f, 8.75f, 3.42f, 8.75f, 4.5f)
                verticalLineTo(8.0f)
                curveTo(8.75f, 8.41f, 8.41f, 8.75f, 8.0f, 8.75f)
                curveTo(7.59f, 8.75f, 7.25f, 8.41f, 7.25f, 8.0f)
                verticalLineTo(4.5f)
                curveTo(7.25f, 2.59f, 8.59f, 1.25f, 10.5f, 1.25f)
                horizontalLineTo(13.5f)
                curveTo(15.41f, 1.25f, 16.75f, 2.59f, 16.75f, 4.5f)
                verticalLineTo(8.0f)
                curveTo(16.75f, 8.41f, 16.41f, 8.75f, 16.0f, 8.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.5f, 17.77f)
                curveTo(20.47f, 17.78f, 20.44f, 17.78f, 20.41f, 17.78f)
                horizontalLineTo(8.0f)
                curveTo(7.59f, 17.78f, 7.25f, 17.44f, 7.25f, 17.03f)
                curveTo(7.25f, 16.61f, 7.59f, 16.28f, 8.0f, 16.28f)
                horizontalLineTo(20.32f)
                lineTo(20.47f, 17.53f)
                curveTo(20.48f, 17.61f, 20.49f, 17.69f, 20.5f, 17.77f)
                close()
            }
        }
        .build()
        return _shoppingbag!!
    }

private var _shoppingbag: ImageVector? = null
