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

public val BulkGroup.Logout1: ImageVector
    get() {
        if (_logout1 != null) {
            return _logout1!!
        }
        _logout1 = Builder(name = "Logout1", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.2402f, 2.0f)
                curveTo(13.7102f, 2.0f, 14.1002f, 2.38f, 14.1002f, 2.86f)
                verticalLineTo(21.15f)
                curveTo(14.1002f, 21.62f, 13.7202f, 22.01f, 13.2402f, 22.01f)
                curveTo(7.3502f, 22.01f, 3.2402f, 17.9f, 3.2402f, 12.01f)
                curveTo(3.2402f, 6.12f, 7.3602f, 2.0f, 13.2402f, 2.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.5409f, 11.5399f)
                lineTo(17.7009f, 8.6899f)
                curveTo(17.4109f, 8.3999f, 16.9309f, 8.3999f, 16.6409f, 8.6899f)
                curveTo(16.3509f, 8.9799f, 16.3509f, 9.4599f, 16.6409f, 9.7499f)
                lineTo(18.2009f, 11.3099f)
                horizontalLineTo(8.6309f)
                curveTo(8.2209f, 11.3099f, 7.8809f, 11.6499f, 7.8809f, 12.0599f)
                curveTo(7.8809f, 12.4699f, 8.2209f, 12.8099f, 8.6309f, 12.8099f)
                horizontalLineTo(18.2009f)
                lineTo(16.6409f, 14.3699f)
                curveTo(16.3509f, 14.6599f, 16.3509f, 15.1399f, 16.6409f, 15.4299f)
                curveTo(16.7909f, 15.5799f, 16.9809f, 15.6499f, 17.1709f, 15.6499f)
                curveTo(17.3609f, 15.6499f, 17.5509f, 15.5799f, 17.7009f, 15.4299f)
                lineTo(20.5409f, 12.5799f)
                curveTo(20.8309f, 12.2999f, 20.8309f, 11.8299f, 20.5409f, 11.5399f)
                close()
            }
        }
        .build()
        return _logout1!!
    }

private var _logout1: ImageVector? = null
